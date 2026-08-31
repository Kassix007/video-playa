.class public final LZ5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:LZ5/i;

.field public static final b:LZ5/U;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LZ5/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ5/i;->a:LZ5/i;

    .line 7
    .line 8
    new-instance v0, LZ5/U;

    .line 9
    .line 10
    const-string v1, "kotlin.Byte"

    .line 11
    .line 12
    sget-object v2, LX5/d;->d:LX5/d;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LZ5/U;-><init>(Ljava/lang/String;LX5/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LZ5/i;->b:LZ5/U;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LZ5/i;->b:LZ5/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, LY5/b;->s()B

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
