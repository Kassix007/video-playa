.class public final LQ/F;
.super LQ/I;
.source "SourceFile"


# static fields
.field public static final c:LQ/F;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LQ/F;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, LQ/I;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LQ/F;->c:LQ/F;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LQ/J;LP/c;LP/D0;LX/j;)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-virtual {p1, p3}, LQ/J;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    const/4 p4, 0x1

    .line 7
    invoke-virtual {p1, p4}, LQ/J;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LB5/e;

    .line 12
    .line 13
    invoke-interface {p2}, LP/c;->j()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p1, p2, p3}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method
