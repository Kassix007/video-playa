.class public final LD/g;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# static fields
.field public static final r:LD/g;

.field public static final s:LD/g;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD/g;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LD/g;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LD/g;->r:LD/g;

    .line 9
    .line 10
    new-instance v0, LD/g;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, LD/g;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LD/g;->s:LD/g;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LD/g;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LD/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LZ/b;

    .line 7
    .line 8
    check-cast p2, LD/y;

    .line 9
    .line 10
    iget-object p1, p2, LD/y;->d:LC/u;

    .line 11
    .line 12
    iget-object p1, p1, LC/u;->b:LP/c0;

    .line 13
    .line 14
    invoke-virtual {p1}, LP/c0;->e()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p2, LD/y;->d:LC/u;

    .line 23
    .line 24
    iget-object p2, p2, LC/u;->c:LP/c0;

    .line 25
    .line 26
    invoke-virtual {p2}, LP/c0;->e()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    filled-new-array {p1, p2}, [Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/n2;->A([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_0
    check-cast p1, LD/s;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    int-to-long p1, p1

    .line 52
    new-instance v0, LD/b;

    .line 53
    .line 54
    invoke-direct {v0, p1, p2}, LD/b;-><init>(J)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
