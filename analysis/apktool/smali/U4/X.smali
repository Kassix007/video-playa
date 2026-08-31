.class public final synthetic LU4/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LU4/X;->q:I

    iput-object p3, p0, LU4/X;->r:Ljava/lang/Object;

    iput-object p4, p0, LU4/X;->t:Ljava/lang/Object;

    iput p1, p0, LU4/X;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LR4/k1;ILc0/m;I)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    iput p4, p0, LU4/X;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/X;->r:Ljava/lang/Object;

    iput p2, p0, LU4/X;->s:I

    iput-object p3, p0, LU4/X;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LU4/X;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/X;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LR4/x;

    .line 9
    .line 10
    iget-object v1, p0, LU4/X;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/c;

    .line 13
    .line 14
    check-cast p1, LP/o;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    iget p2, p0, LU4/X;->s:I

    .line 22
    .line 23
    or-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, LP/b;->w(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {v0, v1, p1, p2}, LE3/h;->i(LR4/x;LB5/c;LP/o;I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    iget-object v0, p0, LU4/X;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LR4/k1;

    .line 38
    .line 39
    iget-object v1, p0, LU4/X;->t:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lc0/m;

    .line 42
    .line 43
    check-cast p1, LP/o;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/16 p2, 0x181

    .line 51
    .line 52
    invoke-static {p2}, LP/b;->w(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iget v2, p0, LU4/X;->s:I

    .line 57
    .line 58
    invoke-static {v0, v2, v1, p1, p2}, LU4/a;->r(LR4/k1;ILc0/m;LP/o;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_1
    iget-object v0, p0, LU4/X;->r:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LR4/k1;

    .line 65
    .line 66
    iget-object v1, p0, LU4/X;->t:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Lc0/m;

    .line 69
    .line 70
    check-cast p1, LP/o;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    iget p2, p0, LU4/X;->s:I

    .line 78
    .line 79
    or-int/lit8 p2, p2, 0x1

    .line 80
    .line 81
    invoke-static {p2}, LP/b;->w(I)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-static {v0, v1, p1, p2}, LU4/a;->b(LR4/k1;Lc0/m;LP/o;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
