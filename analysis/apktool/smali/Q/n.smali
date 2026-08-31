.class public final LQ/n;
.super LQ/I;
.source "SourceFile"


# static fields
.field public static final c:LQ/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LQ/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, LQ/I;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LQ/n;->c:LQ/n;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LQ/J;LP/c;LP/D0;LX/j;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p3, p2, p1}, LC3/a;->L(LP/D0;LP/c;I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p3}, LP/D0;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
