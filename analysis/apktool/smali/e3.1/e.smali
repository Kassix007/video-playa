.class public final Le3/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Le3/g;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Le3/g;II)V
    .locals 0

    .line 1
    iput p3, p0, Le3/e;->q:I

    iput-object p1, p0, Le3/e;->r:Le3/g;

    iput p2, p0, Le3/e;->s:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Le3/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Le3/e;->r:Le3/g;

    .line 13
    .line 14
    iget v2, p0, Le3/e;->s:I

    .line 15
    .line 16
    invoke-static {p1, v2, v0, v1}, Le3/g;->b(Le3/g;IJ)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iget-object p1, p0, Le3/e;->r:Le3/g;

    .line 32
    .line 33
    iget v2, p0, Le3/e;->s:I

    .line 34
    .line 35
    invoke-static {p1, v2, v0, v1}, Le3/g;->b(Le3/g;IJ)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
