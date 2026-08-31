.class public final LQ/d;
.super LQ/I;
.source "SourceFile"


# static fields
.field public static final c:LQ/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LQ/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-direct {v0, v3, v1, v2}, LQ/I;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LQ/d;->c:LQ/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LQ/J;LP/c;LP/D0;LX/j;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, LQ/J;->c(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-virtual {p3, p1}, LP/D0;->a(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
