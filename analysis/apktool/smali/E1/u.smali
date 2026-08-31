.class public final LE1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LE1/x;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, LE1/u;->a:I

    .line 5
    iput-object p1, p0, LE1/u;->d:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, LE1/u;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LR4/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE1/u;->d:Ljava/lang/Object;

    const/16 p1, -0xa

    .line 2
    iput p1, p0, LE1/u;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, LE1/u;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR4/k1;

    .line 4
    .line 5
    iget-object v1, v0, LR4/k1;->t:Lj5/d;

    .line 6
    .line 7
    iget-object v1, v1, Lj5/d;->b:LP5/S;

    .line 8
    .line 9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v3, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, LR4/k1;->n:Lj5/a;

    .line 19
    .line 20
    iget-object v2, v1, Lj5/a;->b:LP5/S;

    .line 21
    .line 22
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lj5/a;->d:LP5/S;

    .line 31
    .line 32
    invoke-virtual {v1, v3}, LP5/S;->g(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, LE1/u;->e:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget v2, p0, LE1/u;->b:I

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget v1, p0, LE1/u;->a:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LE1/u;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, LE1/u;->f:Ljava/lang/Object;

    .line 68
    .line 69
    iget v1, p0, LE1/u;->c:I

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    if-ne v1, v2, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    if-nez v1, :cond_1

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    const/16 v2, -0xa

    .line 86
    .line 87
    if-eq v1, v2, :cond_2

    .line 88
    .line 89
    const/4 v1, -0x1

    .line 90
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, LE1/u;->a:I

    .line 3
    .line 4
    iget-object v0, p0, LE1/u;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, LE1/x;

    .line 7
    .line 8
    iput-object v0, p0, LE1/u;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, LE1/u;->c:I

    .line 12
    .line 13
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    iget-object v0, p0, LE1/u;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE1/x;

    .line 4
    .line 5
    iget-object v0, v0, LE1/x;->b:LE1/A;

    .line 6
    .line 7
    invoke-virtual {v0}, LE1/A;->b()LF1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-virtual {v0, v1}, LF1/c;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, LF1/c;->t:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget v0, v0, LF1/c;->q:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    iget v0, p0, LE1/u;->b:I

    .line 34
    .line 35
    const v1, 0xfe0f

    .line 36
    .line 37
    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    return v0
.end method
