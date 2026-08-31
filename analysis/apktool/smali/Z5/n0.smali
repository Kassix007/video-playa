.class public final LZ5/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final b:LZ5/n0;


# instance fields
.field public final synthetic a:LZ5/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ5/n0;

    .line 2
    .line 3
    invoke-direct {v0}, LZ5/n0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ5/n0;->b:LZ5/n0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LZ5/M;

    .line 5
    .line 6
    invoke-direct {v0}, LZ5/M;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZ5/n0;->a:LZ5/M;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/n0;->a:LZ5/M;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ5/M;->b()LX5/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/n0;->a:LZ5/M;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ5/M;->c(LY5/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 7
    .line 8
    return-object p1
.end method
