.class public final LQ/A;
.super LQ/I;
.source "SourceFile"


# static fields
.field public static final c:LQ/A;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQ/A;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, LQ/I;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LQ/A;->c:LQ/A;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LQ/J;LP/c;LP/D0;LX/j;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, LQ/J;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, LB5/a;

    .line 7
    .line 8
    iget-object p2, p4, LX/j;->e:LR/e;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
