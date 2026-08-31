.class public final LF/Q;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/a;


# direct methods
.method public synthetic constructor <init>(LB5/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LF/Q;->q:I

    iput-object p1, p0, LF/Q;->r:LB5/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LF/Q;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF/Q;->r:LB5/a;

    .line 7
    .line 8
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, LF/Q;->r:LB5/a;

    .line 14
    .line 15
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, LD5/a;->p(FFF)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_1
    iget-object v0, p0, LF/Q;->r:LB5/a;

    .line 38
    .line 39
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    iget-object v0, p0, LF/Q;->r:LB5/a;

    .line 46
    .line 47
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_3
    new-instance v0, LF/e;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iget-object v2, p0, LF/Q;->r:LB5/a;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v0, v3, v1, v2}, LF/e;-><init>(IFLB5/a;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
