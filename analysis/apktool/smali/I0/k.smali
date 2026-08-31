.class public final LI0/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, LI0/k;->q:I

    iput-object p1, p0, LI0/k;->r:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LI0/k;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LI0/k;->r:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, LI0/i;

    .line 11
    .line 12
    invoke-static {p1, v2}, LI0/r;->c(LI0/i;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    invoke-static {p1, v0}, LI0/r;->d(LI0/i;I)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    check-cast p1, LI0/i;

    .line 21
    .line 22
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 23
    .line 24
    sget-object v0, LI0/p;->d:LI0/s;

    .line 25
    .line 26
    sget-object v3, LI0/r;->a:[LH5/k;

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    aget-object v4, v3, v4

    .line 30
    .line 31
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, LI0/p;->r:LI0/s;

    .line 35
    .line 36
    const/16 v2, 0x9

    .line 37
    .line 38
    aget-object v2, v3, v2

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_1
    check-cast p1, LI0/i;

    .line 50
    .line 51
    invoke-static {p1, v2}, LI0/r;->c(LI0/i;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_2
    check-cast p1, LI0/i;

    .line 56
    .line 57
    invoke-static {p1, v2}, LI0/r;->c(LI0/i;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
