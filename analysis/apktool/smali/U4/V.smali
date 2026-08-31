.class public final synthetic LU4/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(ILR4/k1;II)V
    .locals 0

    .line 1
    iput p4, p0, LU4/V;->q:I

    iput p1, p0, LU4/V;->r:I

    iput-object p2, p0, LU4/V;->s:Ljava/lang/Object;

    iput p3, p0, LU4/V;->t:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX/e;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LU4/V;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/V;->s:Ljava/lang/Object;

    iput p2, p0, LU4/V;->r:I

    iput p3, p0, LU4/V;->t:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LU4/V;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/V;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LX/e;

    .line 9
    .line 10
    check-cast p1, LP/o;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget p2, p0, LU4/V;->r:I

    .line 18
    .line 19
    or-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    invoke-static {p2}, LP/b;->w(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget v1, p0, LU4/V;->t:I

    .line 26
    .line 27
    invoke-static {v0, p1, p2, v1}, Lh5/b;->a(LX/e;LP/o;II)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget-object v0, p0, LU4/V;->s:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LR4/k1;

    .line 36
    .line 37
    check-cast p1, LP/o;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    iget p2, p0, LU4/V;->t:I

    .line 45
    .line 46
    or-int/lit8 p2, p2, 0x1

    .line 47
    .line 48
    invoke-static {p2}, LP/b;->w(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iget v1, p0, LU4/V;->r:I

    .line 53
    .line 54
    invoke-static {v1, v0, p1, p2}, LU4/a;->e(ILR4/k1;LP/o;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    iget-object v0, p0, LU4/V;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, LR4/k1;

    .line 61
    .line 62
    check-cast p1, LP/o;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    iget p2, p0, LU4/V;->t:I

    .line 70
    .line 71
    or-int/lit8 p2, p2, 0x1

    .line 72
    .line 73
    invoke-static {p2}, LP/b;->w(I)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget v1, p0, LU4/V;->r:I

    .line 78
    .line 79
    invoke-static {v1, v0, p1, p2}, LU4/a;->a(ILR4/k1;LP/o;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
