.class public final synthetic LU4/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(IILR4/k1;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput p2, p0, LU4/Z;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LU4/Z;->s:I

    iput-object p3, p0, LU4/Z;->r:LR4/k1;

    return-void
.end method

.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LU4/Z;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/Z;->r:LR4/k1;

    iput p2, p0, LU4/Z;->s:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LU4/Z;->q:I

    .line 2
    .line 3
    check-cast p1, LP/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, LU4/Z;->s:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, LP/b;->w(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, LU4/Z;->r:LR4/k1;

    .line 22
    .line 23
    invoke-static {v0, p1, p2}, LU4/a;->d(LR4/k1;LP/o;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-static {p2}, LP/b;->w(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget v0, p0, LU4/Z;->s:I

    .line 38
    .line 39
    iget-object v1, p0, LU4/Z;->r:LR4/k1;

    .line 40
    .line 41
    invoke-static {v0, v1, p1, p2}, LU4/a;->q(ILR4/k1;LP/o;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
