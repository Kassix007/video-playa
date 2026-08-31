.class public final LE/Q;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LE/U;


# direct methods
.method public synthetic constructor <init>(LE/U;I)V
    .locals 0

    .line 1
    iput p2, p0, LE/Q;->q:I

    iput-object p1, p0, LE/Q;->r:LE/U;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LE/Q;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE/Q;->r:LE/U;

    .line 7
    .line 8
    iget-object v0, v0, LE/U;->F:LE/P;

    .line 9
    .line 10
    invoke-interface {v0}, LE/P;->e()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, LE/Q;->r:LE/U;

    .line 20
    .line 21
    iget-object v0, v0, LE/U;->F:LE/P;

    .line 22
    .line 23
    invoke-interface {v0}, LE/P;->b()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_1
    iget-object v0, p0, LE/Q;->r:LE/U;

    .line 33
    .line 34
    iget-object v1, v0, LE/U;->F:LE/P;

    .line 35
    .line 36
    invoke-interface {v1}, LE/P;->a()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v0, v0, LE/U;->F:LE/P;

    .line 41
    .line 42
    invoke-interface {v0}, LE/P;->d()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sub-int/2addr v1, v0

    .line 47
    int-to-float v0, v1

    .line 48
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
