.class public final Lt/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# static fields
.field public static final r:Lt/v;

.field public static final s:Lt/v;

.field public static final t:Lt/v;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt/v;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lt/v;->r:Lt/v;

    .line 9
    .line 10
    new-instance v0, Lt/v;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lt/v;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lt/v;->s:Lt/v;

    .line 17
    .line 18
    new-instance v0, Lt/v;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lt/v;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lt/v;->t:Lt/v;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lt/v;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lt/v;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/q0;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v0, 0x7

    .line 10
    invoke-static {v0, p1}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Lu/n;

    .line 16
    .line 17
    iget v0, p1, Lu/n;->a:F

    .line 18
    .line 19
    iget p1, p1, Lu/n;->b:F

    .line 20
    .line 21
    invoke-static {v0, p1}, Lj0/B;->g(FF)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    new-instance p1, Lj0/H;

    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, Lj0/H;-><init>(J)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    check-cast p1, Lj0/H;

    .line 32
    .line 33
    iget-wide v0, p1, Lj0/H;->a:J

    .line 34
    .line 35
    new-instance p1, Lu/n;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lj0/H;->b(J)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v0, v1}, Lj0/H;->c(J)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p1, v2, v0}, Lu/n;-><init>(FF)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
